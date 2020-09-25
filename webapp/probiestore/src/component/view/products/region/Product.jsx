import React from "react";

export default function Product(props) {
    return (
        <div className="product">
            <div className="product-name">
                {props.name == null ? "[unknown]" : props.name}
            </div>
        </div>
    );
}
