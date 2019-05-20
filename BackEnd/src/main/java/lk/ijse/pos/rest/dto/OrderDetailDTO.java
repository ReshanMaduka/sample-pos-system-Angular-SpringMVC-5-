package lk.ijse.pos.rest.dto;

public class OrderDetailDTO {
    private int qty;
    private double totalPrice;
    private ItemDTO itemDTO;

    public OrderDetailDTO(int qty, double totalPrice, ItemDTO itemDTO) {
        this.setQty(qty);
        this.setTotalPrice(totalPrice);
        this.setItemDTO(itemDTO);
    }

    public OrderDetailDTO() {

    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }
}
