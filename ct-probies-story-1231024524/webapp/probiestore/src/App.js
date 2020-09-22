import React from 'react';
import './App.css';
import products from './assets/product.json';

function App() {
    return (
        <div className="App">
            <div id="title">
                Product name
            </div>
            <div>
                {products.map((product) => {
                        return (
                            <div className="product">
                                <p className="product-name">
                                    {product.name == null ? "[unknown]" : product.name}
                                </p>
                            </div>
                        );
                    }
                )}
            </div>
        </div>
    );
}

export default App;
