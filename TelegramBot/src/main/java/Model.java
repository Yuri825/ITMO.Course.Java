public class Model {
    // собираем параметры (из json), какие мы хотим выводить (name - город, temp - температура, humidity - влажность,
    // main - облачность)
    private String name;
    private Double temp;
    private Double humidity;
    //private String icon;
    private String main;

    // создаем геттеры/сеттеры (свойства, которые описывают нашу модель)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    //public String getIcon() {
//        return icon;
//    }

    // public void setIcon(String icon) {
//        this.icon = icon;
//    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }


}
