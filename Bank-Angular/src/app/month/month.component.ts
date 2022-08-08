import { Component, OnInit } from '@angular/core';
import { Month } from '../month';
import { MonthService } from '../month.service';

@Component({
  selector: 'app-month',
  templateUrl: './month.component.html',
  styleUrls: ['./month.component.css']
})
export class MonthComponent implements OnInit {
  months: Month[];
  constructor(private monthService: MonthService) { }
  

  ngOnInit(): void {
    this.monthService.getMonths().subscribe((data: Month[])=>{
      console.log(data);
      this.months=data;
    });
  }

}
