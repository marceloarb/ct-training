import React, {useState} from 'react';
import productRepo from '../../repository/productRepo';


function ProductsView() {

    const [productList, setProductList] = useState(productRepo);
    return (
        <div className='App'>
            <h1 id="title">
                Product name
            </h1>
            <div>
                {productList.map((product) => {
                    return <div className="product">
                    <div className="product-name">
                        {product}
                    </div>
                </div>
                })}</div>
        </div>
    );
}


export default ProductsView;