import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class LeavepageService {

  constructor(private httpClient:HttpClient) {
   
  }
  getpending() :Observable<pending[]>{
 
   return this.httpClient.get<pending[]>("assets/pendingleave.json");
 }
}
