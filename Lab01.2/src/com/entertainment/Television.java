package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television> {
    // instance variables
    private String brand;
    private int volume;

    // HAS-A Tuner
    private final Tuner tuner = new Tuner();

    public Television(){
    }

    public Television(String brand, int volume){
        setBrand(brand);
        setVolume(volume);
    }

    // business methods
    public int getCurrentChannel(){
        return tuner.getChannel();
    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);
    }

    // accessors
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalArgumentException {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Television that = (Television) o;
//
//        if (volume != that.volume) return false;
//        return brand != null ? brand.equals(that.brand) : that.brand == null;
        boolean result = false;
        if (obj instanceof Television){
            Television other = (Television) obj;
            result = Objects.equals(this.getBrand(), other.getBrand()) && Objects.equals(this.getVolume(), other.getVolume());
        }
        return result;
    }

    @Override
    public int hashCode() {
        //int result = brand != null ? brand.hashCode() : 0;
        //result = 31 * result + volume;
        //return result;
        return Objects.hash(getBrand(),getVolume());
    }

    @Override
    public int compareTo(Television o) {
        int result = this.getBrand().compareTo(o.getBrand());
        if (result == 0) {
            result = Integer.compare(this.getVolume(), o.getVolume());
        }
        return result;
    }

    @Override
    public String toString(){
        return String.format("%s [brand = %s; volume = %s; currentChannel = %s",
                getClass().getSimpleName(), getBrand(), getBrand(), getCurrentChannel());
    }
}