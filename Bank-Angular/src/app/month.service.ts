import { Injectable } from '@angular/core';
import{HttpClient, HttpClientModule} from '@angular/common/http'
import { Observable } from 'rxjs';
import { Month } from './month';


@Injectable({
  providedIn: 'root'
})
export class MonthService {
  private baseUrl='http://localhost:8080/months'
  constructor(private http : HttpClient) { }

  getMonths(): Observable<Month[]>{
    return this.http.get<Month[]>(`${this.baseUrl}`)
  }
  
}
