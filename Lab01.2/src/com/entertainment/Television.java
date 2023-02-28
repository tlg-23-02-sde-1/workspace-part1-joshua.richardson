package com.entertainment;

import java.util.Objects;
import java.util.Optional;

public class Television {
    private String brand;
    private int volume;

//    Constructors:
    public Television(){}
    public Television(String brand, int volume){
        this();
        setBrand(brand);
        setVolume(volume);
    }




    private Tuner tuner = new Tuner();

    public int getCurrentChannel(){
        return tuner.getChannel();
    }

    public void changeChannel(int channel){
        tuner.setChannel(channel);
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return '{' + getClass().getSimpleName() +
                " brand='" + brand + '\'' +
                ", volume=" + volume +
                ", currentChannel=" + getCurrentChannel() +
                '}';
    }

//    public boolean equals(Television obj){
//        return (Objects.equals(getBrand(),obj.getBrand())) && (getVolume() == obj.getVolume());
//    }

    @Override
    public int hashCode(){
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Television){
            var other = (Television) obj;
            return Objects.equals(getBrand(), other.getBrand()) && (getVolume() == other.getVolume());
        }
        return false;
    }
}