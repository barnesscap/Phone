public class Network {
    static private Phone numPhones[] = new Phone[100];

    public Network() { }

    public Network(Phone[] numPhones) {
        this.numPhones = numPhones;
    }

    public static Phone[] getNumPhones() {
        return numPhones;
    }

    public static void setNumPhones(Phone[] numPhones) {
        Network.numPhones = numPhones;
    }

    public static void registration(Phone phone) {
        for (int k = 0; k < numPhones.length; k++) {
            if (numPhones[k] == null) {
                numPhones[k] = phone;
                System.out.println(phone.getNumber() + " - номер телефона успешно зарегистрирован!");
                break;
            }
        }
    }

    public static Phone checkRegistration(String number) {
        for (int k = 0; k < numPhones.length; k++) {
            if (numPhones[k] != null) {
                if (number.equals(numPhones[k].getNumber())) {
                    return numPhones[k];
                }
            }
        }
        return null;
    }
}


