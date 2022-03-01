object Fun {

def func1(x: Double, y: Int) = x + (70*y)
def ex(a: Double) = 50 * a

def func2a(x:(Int,Int), y:(Int,Int)) : (Int,Int) = (x._1+x._2,y._1*y._2)

def func2b(x: Int, y: Int, z: Int) : (Int,Int) =
    if (x > y && x > z)
        if (y > z) (x, y) else (x,z)
    else if (y > z)
        if (x > z) (y,x) else (y,z)
    else if (y > x) (z, y) else (z, x)

def func2c(x: Int, y: Int, z: Int) : (Int,Int,Int) =
    if (x > y && x > z)
        if( y > z) (x,y,z) else (x,z,y)
    else if (y > z)
            if (x > z) (y,x,z) else (y,z,x)
    else if (y > x) (z, y,x) else (z, x,y)

def func2d(leng1: Double, leng2: Double, leng3: Double) : Boolean =
    if(leng1 + leng2 > leng3 && leng2 + leng3 > leng1 && leng1 + leng3 > leng2) true else false

// func2e
def abrev(x: String) : String = x.split(" ").head + " " + x.split(" ").last

def exp(x: Int, y: Int):Int = if(y == 0) 1 else x * exp(x, y-1)

def fl(x : List[Int]): (Int, Int) = if(x.size == 2) (x.head,x.last)  else fl(x.head :: x.tail.tail)
}
