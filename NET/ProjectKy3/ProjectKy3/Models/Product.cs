namespace ProjectKy3.Models
{
    public class Product
    {
        public int Id { get; set; }
        public string Name { get; set; } = string.Empty;
        public string Description { get; set; } = string.Empty;
        public decimal Price { get; set; }
        public int CategoryId { get; set; }  // Thêm CategoryId để liên kết với Category
        public Category? Category { get; set; }  // Thêm thuộc tính Category để lưu thông tin chi tiết
    }
}
