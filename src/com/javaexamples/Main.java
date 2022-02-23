package com.javaexamples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException, InterruptedException {
        /*Long currentTime = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        Date date = new Date(currentTime);
        String time = simpleDateFormat.format(date);
        System.out.println(time);

        Calendar now = Calendar.getInstance();
        System.out.println(now.getTimeZone());
        System.out.println(now.getTime());

        TimeZone obj = TimeZone.getDefault();
        System.out.println("\nDefault timezone object: " + obj + "\n");
        // setting the raw offset
        obj.setRawOffset(19800000);
        System.out.println("The value of the offset is :" + obj.getRawOffset());
        System.out.println("Default timezone object: \n" + obj);

        String dateString = "UTC";
        String formatString = "z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatString);
        Date date = simpleDateFormat.parse(dateString);

        TimeZone timeZone = TimeZone.getTimeZone("UTC");

        long now = System.currentTimeMillis();

        Calendar cal = new GregorianCalendar(simpleDateFormat.getTimeZone());
        cal.setTime(date);

        if (timeZone.getOffset(now) == cal.getTimeZone().getOffset(now)) {
            System.out.println("Works as expected");
        } else {
            System.err.println("The timezone parsed with the simple date format has an offset '" +
                    cal.getTimeZone().getOffset(now) + "', but the timezone offset of TimeZone.getTimeZone('UTC') is '" + timeZone.getOffset(now) + "'");
        }
        System.out.println("TimeZone.getTimeZone('UTC') : " + TimeZone.getTimeZone("UTC"));
        System.out.println("cal.getTimeZone() : " + cal.getTimeZone());

        DateFormat formatterUTC = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        formatterUTC.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date createdOn = new Date();
        try {
            createdOn = formatterUTC.parse(formatterUTC.format(new Date()));
            System.out.println("Input Date : " + createdOn);


            DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
            String outputText = outputFormat.format(createdOn);
            createdOn = outputFormat.parse(outputText);

            System.out.println("Output Date : " + createdOn);


            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(formatter.format(createdOn));
        } catch (ParseException e) {

        }

        Double num = 13.99999998;
        long roundedDispensedTotalQty = Math.round(num);

        num = (double) roundedDispensedTotalQty;
        System.out.println(num);

        String s = "  Paraffin soft white (SGH) ointment, 30 g tube    ";
        System.out.println(s);
        System.out.println("s.length() : " + s.length());
        System.out.println("\n");

        System.out.println(s.trim());
        System.out.println("s.trim().length() : " + s.trim().length());
        System.out.println("\n");

        System.out.println(s.trim().toLowerCase());
        System.out.println("s.trim().toLowerCase().length() : " + s.trim().toLowerCase().length());

        List<String> responses = new ArrayList<>();
        System.out.println(responses);

        @Override
        public void test(){
            ObjectMapper mapper = new ObjectMapper();
            ArrayList genericFormularyInventory = new ArrayList();

            genericFormularyInventory.add("abc");
            genericFormularyInventory.add("def");
            genericFormularyInventory.add("ghi");
            genericFormularyInventory.add("abc");

            try {
                String testStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(genericFormularyInventory);
                System.out.println("\n");
                System.out.println(testStr);
                System.out.println("\n");

                ArrayList returnedBrandInventory = mapper.readValue(testStr, ArrayList.class);
                System.out.println(returnedBrandInventory.size());
                returnedBrandInventory.forEach(ele -> {
                    System.out.println(ele);
                });
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        Set<Integer> hash_Set = new HashSet<Integer>();

        hash_Set.add(2);
        hash_Set.add(2);
        hash_Set.add(2);
        hash_Set.add(2);
        hash_Set.add(2);

        System.out.println(hash_Set);

        try{
            int num = 0/0;
            System.out.println(num);
            System.out.println("Hello world!");

        } catch (Exception e){
            e.printStackTrace();
        }

        Date cd = new Date();
        Date currentDate = new Date();
        currentDate.setTime(currentDate.getTime() + (25 * 60 * 60 * 1000));
        System.out.println("Time 1 = " + cd);
        System.out.println("Time 2 = " + currentDate);
        System.out.println("Time Difference = " + (currentDate.getTime() - cd.getTime()));


        Date currentDateTime = new Date();
        DateFormat formatterUTC = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        formatterUTC.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            System.out.println(formatterUTC.format(new Date()));
            currentDateTime = formatterUTC.parse(formatterUTC.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(currentDateTime);

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("UTC Time is: " + dateFormat.format(date));

        Double value = 4.5834333333;
        Integer places = 1;
        try{
            if(value != null && places != null && (places > 0)){
                BigDecimal bd = new BigDecimal(Double.toString(value));
                bd = bd.setScale(places, RoundingMode.HALF_UP);

                System.out.println(bd.doubleValue());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        String string = "{\"name\": \"Sam Smith\", \"technology\": \"Python\"}";
        JSONObject json = new JSONObject(string);
        System.out.println(json.toString());

        String test = "sickling/t";
        System.out.println(test.contains("sick"));

        System.out.println(Boolean.TRUE.equals(true));

        List<String> srings = Arrays.asList("A", "B", "C");

        srings.forEach(obj -> {
            obj = "D";
            System.out.println(obj);
        });

        srings.forEach(obj -> {
            System.out.println(obj);
        });

        Date currentDateTime = new Date();

        Timestamp ts = new Timestamp(currentDateTime.getTime());
        Date startDateTime = ts;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String outputText = dateFormat.format(startDateTime);

        currentDateTime = new SimpleDateFormat("yyyy-MM-dd").parse(outputText);

        System.out.println(currentDateTime.getTime());


        Date createdOn = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse("06-AUG-21 02.13.10.000000000 PM");

        System.out.println(createdOn.getTime());

        System.out.println(new HashSet<>().toString() == "[]");

        String original = "insecure";
        original.replace('i', '9');
        System.out.println(original);

        String original = "insecure";
        original = original.replace('i', '9');
        System.out.println(original);

        HashMap<Long, String> ivMedDetailsIdAndSchDate = new HashMap<>();
        ivMedDetailsIdAndSchDate.put(1L, "abc");
        ivMedDetailsIdAndSchDate.put(2L, "def");

        System.out.println(ivMedDetailsIdAndSchDate);

        HelloRunnable myRunnable = new HelloRunnable();
        myRunnable.run();

        String[] myNumbers = {"1", "2", "3"};
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        for (String str : myNumbers) {
            System.out.println(str);
        }

        Thread hr1 = new Thread(new HelloRunnable(), " hr1");
        Thread hr2 = new Thread(new HelloRunnable(), " hr2");

        hr1.start();
        hr1.join(); // Block the current thread (Main) until hr1 is completed
        hr2.start();

        TestMultiPriority m1 = new TestMultiPriority();
        TestMultiPriority m2 = new TestMultiPriority();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();


        try {
            Date originalDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse("01/10/2022 12:27 pm");
            System.out.println(originalDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println((double) Math.round(349984.50));

        System.out.println(filterDateHourTimeNew("2022-02-14T00:00:00"));*/
    }

    public static Date filterDateHourTimeNew(String startDateTime) {
        Date originalDate = null;

        try {
            originalDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm").parse(startDateTime);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return originalDate;
    }

}
