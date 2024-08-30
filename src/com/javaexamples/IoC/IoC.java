package com.javaexamples.IoC;

public class IoC {
    public static void main(String[] args) {
        PrintName printName = new PrintName();

        IoC ioC = new IoC();
        IoC.AddToDatabase addToDatabase = ioC.new AddToDatabase(ioC.new MySqlDatabase());
        addToDatabase.add("Sample 01");
    }

    public class AddToDatabase {
        IoC.Database database;

        public AddToDatabase(IoC.Database database) {
            this.database = database;
        }

        public void add(String data) {
            database.persist(data);
        }
    }

    public interface Database {
        public void persist(String data);
    }

    public class MySqlDatabase implements IoC.Database {

        @Override
        public void persist(String data) {
            System.out.println(data + " persisted to MySqlDatabase!");
        }
    }

    public class OracleDatabase implements IoC.Database {
        @Override
        public void persist(String data) {
            System.out.println(data + " persisted to OracleDatabase!");
        }
    }

    static class PrintName {
        public PrintName() {
            System.out.println("PrintName called");
        }
    }
}
