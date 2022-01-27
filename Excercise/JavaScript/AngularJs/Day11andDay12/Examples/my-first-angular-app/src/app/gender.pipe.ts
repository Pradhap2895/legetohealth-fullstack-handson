import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genderFormat'
})
export class GenderPipe implements PipeTransform {

  transform(value: string,gen: string):string {

    return (gen == 'Male'?'Mr.':'Ms.')+value;
  }

}
