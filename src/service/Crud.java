package service;

public interface Crud {
    public String createHouse(models.House house);
    public models.House[] getHouseByHouseType(models.House houseType);
    public models.House getHouseById(long id);
    public String updateHouse(long id, models.House house);
    public String deleteHouse(long id);
}
