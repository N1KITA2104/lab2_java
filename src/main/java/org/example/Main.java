package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        XmlSerialization<Transport> xmlSerializer = new XmlSerialization<>(Transport.class);

        Transport.Builder builder = new Transport.Builder("Toyota", "Camry", 1500.0);
        builder.setProductionYear(2022);
        builder.setPrice(25000.0);
        Transport transport = builder.build();

        // Сериализация объекта и вывод в консоль
        String xmlData = xmlSerializer.serialize(transport);
        System.out.println("Serialized XML data:\n" + xmlData);

        // Десериализация XML данных
        Transport deserializedTransport = xmlSerializer.deserialize(xmlData);
        System.out.println("Deserialized Transport:\n" + deserializedTransport.toString());

        // Запись в файл и чтение из файла (раскомментируйте код ниже)
        // try {
        //     xmlSerializer.writeToFile(List.of(transport), "transport.xml");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try {
        //     List<Transport> deserializedTransports = xmlSerializer.readFromFile("transport.xml");
        //     for (Transport t : deserializedTransports) {
        //         System.out.println("Deserialized Transport:\n" + t.toString());
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
    }
}

