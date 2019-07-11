package jrout.batch30.bikeclient;

import jrout.batch30.bikeservice.BikeService;

public class BikeClient {
    public static void main(String[] args) {
        BikeService bikeService = new BikeService();
        bikeService.callBikeService();
    }
}
