package com.iot.connection;

import com.iot.generation.Generator;
import com.iot.model.Device;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Connect {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        final SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        final Session session = sessionFactory.openSession();
        Transaction tx= session.beginTransaction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Check list of devices");
        System.out.println("2.Add device");
        int number= scanner.nextInt();
        switch(number){
            case 1:
                final List<Device> deviceList = session.createQuery("FROM Device ",Device.class).getResultList();
                for (Device d: deviceList
                     ) {
                    System.out.printf(" %s %s %s \n",
                            d.getName(),
                            d.getModel(),
                            d.getProducent()
                            );
                }
                break;
            case 2:
                System.out.println("set name: ");
                String name = scanner.next();
                System.out.println("set model: ");
                String model= scanner.next();
                System.out.println("set producent: ");
                String producent= scanner.next();
                Generator generator = new Generator();
                Random random = new Random();
                double rangeofTemperature = random.nextDouble();
                double rangeofMeasurement = random.nextDouble();
                double currentMeasure = generator.generujLiczbe(-99,99);
                Device device = new Device();
                device.setName(name);
                device.setModel(model);
                device.setProducent(producent);
                device.setRangeofTemperature(rangeofTemperature);
                device.setRangeofMeasurement(rangeofMeasurement);
                device.setCurrentMeasure(currentMeasure);
                session.save(device);
                tx.commit();


                break;

        }

        session.close();
        StandardServiceRegistryBuilder.destroy(registry);

    }

}
