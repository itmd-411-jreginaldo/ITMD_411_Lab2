/*
Josh Reginaldo
ITMD-411

Lab 2 - Bank Record Generations

A bank has received a .csv file containing raw data of various clients.
This lab will have us parse the data and print a record for future loan considerations
*/

public class BankRecordsTest {
    public static void main(String[] args) {
        Client newClient = new Client();

        newClient.readData();
    }
}
