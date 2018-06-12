package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bxx
  extends bhd
{
  public int lOM;
  public String rem;
  public String sdK;
  public String sdL;
  public int sdM;
  public String sdN;
  public bhy stX;
  public int stY;
  public int stZ;
  public String sua;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.stX == null) {
        throw new b("Not all required fields were included: Receipt");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.stX != null)
      {
        paramVarArgs.fV(2, this.stX.boi());
        this.stX.a(paramVarArgs);
      }
      if (this.rem != null) {
        paramVarArgs.g(3, this.rem);
      }
      paramVarArgs.fT(4, this.stY);
      paramVarArgs.fT(5, this.lOM);
      if (this.sdK != null) {
        paramVarArgs.g(6, this.sdK);
      }
      if (this.sdL != null) {
        paramVarArgs.g(7, this.sdL);
      }
      if (this.sdN != null) {
        paramVarArgs.g(8, this.sdN);
      }
      paramVarArgs.fT(9, this.stZ);
      if (this.sua != null) {
        paramVarArgs.g(10, this.sua);
      }
      paramVarArgs.fT(11, this.sdM);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label893;
      }
    }
    label893:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.stX != null) {
        paramInt = i + f.a.a.a.fS(2, this.stX.boi());
      }
      i = paramInt;
      if (this.rem != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rem);
      }
      i = i + f.a.a.a.fQ(4, this.stY) + f.a.a.a.fQ(5, this.lOM);
      paramInt = i;
      if (this.sdK != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sdK);
      }
      i = paramInt;
      if (this.sdL != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.sdL);
      }
      paramInt = i;
      if (this.sdN != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.sdN);
      }
      i = paramInt + f.a.a.a.fQ(9, this.stZ);
      paramInt = i;
      if (this.sua != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.sua);
      }
      return paramInt + f.a.a.a.fQ(11, this.sdM);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.stX != null) {
          break;
        }
        throw new b("Not all required fields were included: Receipt");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bxx localbxx = (bxx)paramVarArgs[1];
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
            localbxx.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbxx.stX = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbxx.rem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbxx.stY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbxx.lOM = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbxx.sdK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbxx.sdL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbxx.sdN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localbxx.stZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbxx.sua = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbxx.sdM = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bxx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */