package boran;



public record DataPoint(String date,int krankeLeute){

    public static DataPoint readLine(String line) {

        String date = line.split(";") [0];
        String krankeLeute = line.split(";") [2];

        int krankeLeuteInt = Integer.parseInt(krankeLeute);
        return new DataPoint(date, krankeLeuteInt);
//                "11.03.2020;3237;3190;3283;2292;2253;2332;3,41;3,33;3,49;3,12;3,08;3,16"
    }

}