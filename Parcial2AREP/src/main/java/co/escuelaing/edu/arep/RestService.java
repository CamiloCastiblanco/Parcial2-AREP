package co.escuelaing.edu.arep;

import java.util.ArrayList;

import static spark.Spark.*;


public class RestService {

    private static ArrayList<Integer> myList = new ArrayList<Integer>();

    public static void main(String... args){
        staticFiles.location("/public");
        port(getPort());
        get("hello", (req,res) -> "Hello World!");
        get("lucassequence", (req,res) -> {
            String value = req.queryParams("value");
            res.type("application/json");
            return "{\n" +
                    "\n" +
                    " \"operation\": \"lucasSequence\",\n" +
                    "\n" +
                    " \"input\":  "+ value +",\n" +
                    "\n" +
                    " \"output\": \"" + lucasSequence(value) +
                    "\"\n" +
                    "}";
        });

        post("lucassequence", (req,res) -> {
            String value = req.queryParams("value");
            res.type("application/json");
            return "{\n" +
                    "\n" +
                    " \"operation\": \"lucassequence\",\n" +
                    "\n" +
                    " \"input\":  "+ value +",\n" +
                    "\n" +
                    " \"output\": \"" + lucasSequence(value) +
                    "\"\n" +
                    "}";
        });

    }


    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    private static String lucasSequence(String number) {
        myList = new ArrayList<Integer>();
        int num = Integer.parseInt(number);
        for(int i=0; i<=num; i++){
            myList.add(buildListSequence(i));
        }
        return myList.toString().replace("[","").replace("]","");
    }


    private static int buildListSequence(int num) {
        if (num == 0) {
            return 2;
        } else if (num == 1) {
            return 1;
        } else {
            return buildListSequence(num - 1) + buildListSequence(num -2);
        }

    }



}