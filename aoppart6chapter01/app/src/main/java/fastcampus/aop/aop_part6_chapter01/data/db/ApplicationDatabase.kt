package fastcampus.aop.aop_part6_chapter01.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import fastcampus.aop.aop_part6_chapter01.data.db.dao.FoodMenuBasketDao
import fastcampus.aop.aop_part6_chapter01.data.db.dao.LocationDao
import fastcampus.aop.aop_part6_chapter01.data.db.dao.RestaurantDao
import fastcampus.aop.aop_part6_chapter01.data.entity.LocationLatLngEntity
import fastcampus.aop.aop_part6_chapter01.data.entity.RestaurantEntity
import fastcampus.aop.aop_part6_chapter01.data.entity.RestaurantFoodEntity

@Database(
    entities = [LocationLatLngEntity::class, RestaurantFoodEntity::class, RestaurantEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ApplicationDatabase: RoomDatabase() {

    companion object {
        const val DB_NAME = "ApplicationDataBase.db"
    }

    abstract fun LocationDao(): LocationDao

    abstract fun RestaurantDao(): RestaurantDao

    abstract fun FoodMenuBasketDao(): FoodMenuBasketDao

}