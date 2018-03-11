public class Phone {
    private String number;
    private String model;
    private String color;

    public Phone() { }

    public Phone(String number, String model, String color) {
        this.number = number;
        this.model = model;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() { return model;  }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void registration(Phone phone) {
        Network.registration(phone);
    }

    public void call(String number) {
        System.out.println();
        System.out.println("Делаем вызов с номера - " + this.number + " на номер - " + number);
        incomingCall(number, this.number);
    }

    private void incomingCall(String number, String inNum) {
        if (Network.checkRegistration(number) == null)
            System.out.println(number + " - номер не зарегистрирован в сети");
        else if (inNum == number) System.out.println("Нельзя позвонить самому себе!");
        else
            System.out.println(Network.checkRegistration(number).toString() + "\'" + " Вас вызывает - " + inNum);
    }

    @Override
    public String toString() {
        return "Ваш номер - '" + number + '\'' +
                ", Модель Вашего телефона - '" + model + '\'' +
                ", Цвет - '" + color + '\'';
    }
}
