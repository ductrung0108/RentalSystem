package rentalManagementSystem;

public interface SystemView {
    public default void getMainView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ RENTAL MANAGEMENT SYSTEM ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. TENANT MENU");
        System.out.println("2. OWNER MENU");
        System.out.println("3. HOST MENU");
        System.out.println("4. PROPERTY MENU");
        System.out.println("5. RENTAL AGREEMENT MENU");
        System.out.println("6. Exit");
        System.out.println();
    }

    public default void getTenantView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ TENANT MENU ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Create a tenant");
        System.out.println("2. View tenants");
        System.out.println("3. Delete a tenant");
        System.out.println("4. Select a tenant");
        System.out.println("5. Back to main menu.");
        System.out.println();
    }

    public default void getSpecificTenantView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ TENANT MENU ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Update information.");
        System.out.println("2. View payments");
        System.out.println("3. Add a payment");
        System.out.println("4. Update a payment");
        System.out.println("5. Delete a payment");
        System.out.println("6. Back to tenant menu");
        System.out.println();
    }

    public default void getOwnerView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ OWNER MENU ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Create an owner");
        System.out.println("2. View owners");
        System.out.println("3. View an owner's properties");
        System.out.println("4. Update an owner's information");
        System.out.println("4. Delete an owner");
        System.out.println("6. Back to main menu");
        System.out.println();
    }

    public default void getHostView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ HOST MENU ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Create a host");
        System.out.println("2. View hosts");
        System.out.println("3. View a host's properties");
        System.out.println("4. Update a host's information");
        System.out.println("4. Delete a host");
        System.out.println("6. Back to main menu");
        System.out.println();
    }
    public default void getPropertyView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ PPROPERTY MENU ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Create a residential property");
        System.out.println("2. Create a commercial property");
        System.out.println("3. View residential properties");
        System.out.println("4. View commercial properties");
        System.out.println("5. Update a property's information");
        System.out.println("6. Delete a property");
        System.out.println("7. Back to main menu");
        System.out.println();
    }
    public default void getRentalAgreementView() {
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++ PPROPERTY MENU ++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("1. Create a rental agreement");
        System.out.println("2. View rental agreements");
        System.out.println("3. Update an agreement's information");
        System.out.println("4. Delete an agreement");
        System.out.println("5. Back to main menu");
        System.out.println();
    }
}
