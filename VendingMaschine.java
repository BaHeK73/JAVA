class HotDrinkMaschine implements VendingMaschine {
    ArrayList<HotDrinkTemperature> drinks = new ArrayList<>();

    public void addDrink(HotDrinkTemperature drink) {
        drinks.add(drink);
    }

    public HotDrinkTemperature getProduct(String name, int volume, int temperature) {
        for (HotDrinkTemperature name : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                drinks.remove(drink);
                return drink;
            }
        }
        return null;
    }
}
