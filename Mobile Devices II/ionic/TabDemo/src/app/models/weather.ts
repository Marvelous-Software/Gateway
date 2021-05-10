//import { Deserializable } from './deserializable.weather'

export class Weather {

    sys: Sys
    weather: string[]

    /*
        private covertUnixToHour(utc: number) {
    
            date: Date = new Date(utc * 1000);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            formatted: string = sdf.format(date);
            return formatted;
        }
    */
    deserialize(input: any): this {
        return Object.assign(this, input)
    }

    get Sunrise() {
        return (new Date(this.sys.sunrise * 1000)).toLocaleTimeString()
    }

    get SunriseFull() {
        return (new Date(this.sys.sunrise * 1000))
    }

    get Sunset() {
        return (new Date(this.sys.sunset * 1000)).toLocaleTimeString()
    }

    get SunsetFull() {
        return new Date(this.sys.sunset * 1000)
    }

    formatDat(): Date {
        return new Date(this.sys.sunrise * 1000);
    }
}

export class Sys {

    type: number
    id: number
    country: string
    sunrise: number
    sunset: number

}


/*
export class OWjson {
    coord: Coord;
    weather: WeatherEntity[]
    base: string
    main: Main
    visibility: number
    wind: Wind
    clouds: Clouds
    dt: number
    sys: Sys
    timezone: number
    id: number
    name: string
    cod: number
}
export class Coord {
    lon: number;
    lat: number;
}
export class WeatherEntity {
    id: number;
    main: string;
    description: string;
    icon: string;
}
export class Main {
    temp: number
    feels_like: number
    temp_min: number
    temp_max: number
    pressure: number
    humidity: number
}
export class Wind{
    speed: number
    deg: number
    gust: number
}
export class Clouds{
    all: number
}
export class Sys{
    type: number
    id: number
    country: string
    sunrise: number
    sunset: number
}
*/