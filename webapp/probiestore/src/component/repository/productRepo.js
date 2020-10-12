import products from '../../assets/product.json';

const productRepo = () =>{
    const productList = products.map((product) => product.name == null ? "[unknown]" : product.name);
    return productList
            
}
export default productRepo;




