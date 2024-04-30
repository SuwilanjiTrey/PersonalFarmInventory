import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Date;

public class MainTest {

    @Test
    public void testFarmIncome() {
        FarmIncome income = new FarmIncome(new Date(), "Crop Sales", "Sale of wheat", "Cash", 1500.00, 4);
        assertEquals("Crop Sales", income.getSource());
        assertEquals("Sale of wheat", income.getDescription());
        assertEquals("Cash", income.getPaymentMethod());
        assertEquals(1500.00, income.getAmount());
        assertEquals(4, income.getMonth());
    }

    @Test
    public void testFarmExpenses() {
        FarmExpenses expense = new FarmExpenses(new Date(), "Seeds", 200.00, "Purchased from local store", 4);
        assertEquals("Seeds", expense.getExpenses());
        assertEquals(200.00, expense.getCost());
        assertEquals("Purchased from local store", expense.getRemarks());
        assertEquals(4, expense.getMonth());
    }

    @Test
    public void testLivestockRecord() {
        LivestockRecord livestock = new LivestockRecord("Cow1", "Female", 500.00, 1000.00, 800.00, 1200.00, "Cow");
        assertEquals("Cow1", livestock.getName());
        assertEquals("Female", livestock.getGender());
        assertEquals(500.00, livestock.getWeight());
        assertEquals(1000.00, livestock.getValue());
        assertEquals(800.00, livestock.getBoughtPrice());
        assertEquals(1200.00, livestock.getSalePrice());
        assertEquals("Cow", livestock.getAnimalType());
    }

    @Test
    public void testMain() {
        // FarmIncome, FarmExpenses, and LivestockRecord Instances
        FarmIncome income1 = new FarmIncome(new Date(), "Crop Sales", "Sale of wheat", "Cash", 1500.00, 4);
        FarmIncome income2 = new FarmIncome(new Date(), "Livestock Sales", "Sale of cows", "Bank transfer", 5000.00, 4);

        FarmExpenses expense1 = new FarmExpenses(new Date(), "Seeds", 200.00, "Purchased from local store", 4);
        FarmExpenses expense2 = new FarmExpenses(new Date(), "Feed", 300.00, "Ordered online", 4);

        LivestockRecord livestock1 = new LivestockRecord("Cow1", "Female", 500.00, 1000.00, 800.00, 1200.00, "Cow");
        LivestockRecord livestock2 = new LivestockRecord("Sheep1", "Male", 100.00, 200.00, 150.00, 250.00, "Sheep");

        // ArrayLists to store instances
        ArrayList<FarmIncome> farmIncomes = new ArrayList<>();
        ArrayList<FarmExpenses> farmExpenses = new ArrayList<>();
        ArrayList<LivestockRecord> livestockRecords = new ArrayList<>();

        // Instances to the lists
        farmIncomes.add(income1);
        farmIncomes.add(income2);

        farmExpenses.add(expense1);
        farmExpenses.add(expense2);

        livestockRecords.add(livestock1);
        livestockRecords.add(livestock2);

        // Printing details of farm incomes
        System.out.println("Farm Incomes:");
        for (FarmIncome income : farmIncomes) {
            System.out.println("Date: " + income.getDate());
            System.out.println("Source: " + income.getSource());
            System.out.println("Description: " + income.getDescription());
            System.out.println("Payment Method: " + income.getPaymentMethod());
            System.out.println("Amount: " + income.getAmount());
            System.out.println("Month: " + income.getMonth());
            System.out.println();
        }

        // Print details of farm expenses
        System.out.println("Farm Expenses:");
        for (FarmExpenses expense : farmExpenses) {
            System.out.println("Date: " + expense.getDate());
            System.out.println("Expenses: " + expense.getExpenses());
            System.out.println("Cost: " + expense.getCost());
            System.out.println("Remarks: " + expense.getRemarks());
            System.out.println("Month: " + expense.getMonth());
            System.out.println();
        }

        // Print details of livestock records
        System.out.println("Livestock Records:");
        for (LivestockRecord livestock : livestockRecords) {
            System.out.println("Name: " + livestock.getName());
            System.out.println("Gender: " + livestock.getGender());
            System.out.println("Weight: " + livestock.getWeight());
            System.out.println("Value: " + livestock.getValue());
            System.out.println("Bought Price: " + livestock.getBoughtPrice());
            System.out.println("Sale Price: " + livestock.getSalePrice());
            System.out.println("Animal Type: " + livestock.getAnimalType());
            System.out.println();
        }
    }
}
