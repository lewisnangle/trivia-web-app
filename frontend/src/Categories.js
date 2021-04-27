import React, {useState,useEffect} from 'react';

function Categories ({categories}) {

    console.log(categories)
    
    return (
        <div>
                    {
            categories.map(category => (
              <h2 key = {category.id}>
                  <div>{category.name}</div>
              </h2>
              ))
          }
        </div>
    )
}


export default Categories;