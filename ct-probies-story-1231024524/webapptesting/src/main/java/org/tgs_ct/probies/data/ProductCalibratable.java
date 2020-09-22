package org.tgs_ct.probies.data;

public abstract class ProductCalibratable {
    abstract String getName();

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!obj.getClass().getSuperclass().equals(ProductCalibratable.class)){
            return false;
        }
        ProductCalibratable comparator = (ProductCalibratable) obj;
        return comparator.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
