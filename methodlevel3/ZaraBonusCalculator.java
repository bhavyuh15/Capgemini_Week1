
public class ZaraBonusCalculator {


	  // Method to generate random salary and years of service
    public  int[] generateSalaryAndService() {
        int salary = (int) (Math.random() * 90000) + 10000; // 5-digit salary
        int yearsOfService = (int) (Math.random() * 20) + 1; // Years of service between 1 and 20
        return new int[] { salary, yearsOfService };
    }

    // Method to calculate new salary and bonus
    public  double[][] calculateNewSalaryAndBonus(int[][] employees) {
        double[][] newSalaryAndBonus = new double[10][2];
        for (int i = 0; i < 10; i++) {
            int oldSalary = employees[i][0];
            int yearsOfService = employees[i][1];
            double bonus = (yearsOfService >= 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            newSalaryAndBonus[i][0] = newSalary;  // New salary
            newSalaryAndBonus[i][1] = bonus;     // Bonus
        }
        return newSalaryAndBonus;
    }

    // Method to calculate total old salary, total new salary, and total bonus amount
    public  double[] calculateTotals(int[][] employees, double[][] salaryAndBonus) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            totalOldSalary += employees[i][0];
            totalNewSalary += salaryAndBonus[i][0];
            totalBonus += salaryAndBonus[i][1];
        }

        return new double[] { totalOldSalary, totalNewSalary, totalBonus };
    }

    public static void main(String[] args) {
        // Create 2D array to store salary and years of service
        int[][] employees = new int[10][2];
		ZaraBonusCalculator obj = new ZaraBonusCalculator();

        // Generate random salary and years of service for 10 employees
        for (int i = 0; i < 10; i++) {
            employees[i] = obj.generateSalaryAndService();
        }

        // Calculate new salary and bonus
        double[][] salaryAndBonus = obj.calculateNewSalaryAndBonus(employees);

        // Calculate totals
        double[] totals = obj.calculateTotals(employees, salaryAndBonus);

        // Display results in tabular format 
        System.out.println("Employee No | Old Salary | Years of Service | New Salary | Bonus");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "  |  " 
                + employees[i][0] + "  |  " 
                + employees[i][1] + "  |  " 
                + salaryAndBonus[i][0] + "  |  " 
                + salaryAndBonus[i][1]);
        }

        
        System.out.println("\nTotal Old Salary: " + totals[0]);
        System.out.println("Total New Salary: " + totals[1]);
        System.out.println("Total Bonus Amount: " + totals[2]);
    }

  
}

