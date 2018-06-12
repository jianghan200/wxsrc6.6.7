package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aza
  extends bhd
{
  public String jPg;
  public String jQb;
  public String jSv;
  public String rEf;
  public aw rmQ;
  public String rsw;
  public String rsx;
  public String rsy;
  public String rsz;
  public String sbN;
  public String sbO;
  public String sbP;
  public String sbQ;
  public String sbR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.sbN != null) {
        paramVarArgs.g(3, this.sbN);
      }
      if (this.rEf != null) {
        paramVarArgs.g(4, this.rEf);
      }
      if (this.rsw != null) {
        paramVarArgs.g(5, this.rsw);
      }
      if (this.sbO != null) {
        paramVarArgs.g(6, this.sbO);
      }
      if (this.rsx != null) {
        paramVarArgs.g(7, this.rsx);
      }
      if (this.rsy != null) {
        paramVarArgs.g(8, this.rsy);
      }
      if (this.rsz != null) {
        paramVarArgs.g(9, this.rsz);
      }
      if (this.sbP != null) {
        paramVarArgs.g(10, this.sbP);
      }
      if (this.rmQ != null)
      {
        paramVarArgs.fV(11, this.rmQ.boi());
        this.rmQ.a(paramVarArgs);
      }
      if (this.sbQ != null) {
        paramVarArgs.g(12, this.sbQ);
      }
      if (this.jPg != null) {
        paramVarArgs.g(13, this.jPg);
      }
      if (this.jSv != null) {
        paramVarArgs.g(14, this.jSv);
      }
      if (this.sbR != null) {
        paramVarArgs.g(15, this.sbR);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label1153;
      }
    }
    label1153:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.sbN != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sbN);
      }
      paramInt = i;
      if (this.rEf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rEf);
      }
      i = paramInt;
      if (this.rsw != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rsw);
      }
      paramInt = i;
      if (this.sbO != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sbO);
      }
      i = paramInt;
      if (this.rsx != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rsx);
      }
      paramInt = i;
      if (this.rsy != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rsy);
      }
      i = paramInt;
      if (this.rsz != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rsz);
      }
      paramInt = i;
      if (this.sbP != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.sbP);
      }
      i = paramInt;
      if (this.rmQ != null) {
        i = paramInt + f.a.a.a.fS(11, this.rmQ.boi());
      }
      paramInt = i;
      if (this.sbQ != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.sbQ);
      }
      i = paramInt;
      if (this.jPg != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.jPg);
      }
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.jSv);
      }
      i = paramInt;
      if (this.sbR != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.sbR);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aza localaza = (aza)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaza.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaza.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaza.sbN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaza.rEf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaza.rsw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaza.sbO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaza.rsx = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaza.rsy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localaza.rsz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localaza.sbP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 11: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localaza.rmQ = ((aw)localObject1);
            paramInt += 1;
          }
        case 12: 
          localaza.sbQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localaza.jPg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 14: 
          localaza.jSv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaza.sbR = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */