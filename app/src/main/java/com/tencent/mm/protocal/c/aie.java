package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class aie
  extends bhd
{
  public String hcS;
  public String iwP;
  public String rKV;
  public String rKW;
  public String rKX;
  public String rKY;
  public String rKZ;
  public int rLa;
  public String reS;
  public bhy rhB;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rhB == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.rhB != null)
      {
        paramVarArgs.fV(2, this.rhB.boi());
        this.rhB.a(paramVarArgs);
      }
      if (this.rKV != null) {
        paramVarArgs.g(3, this.rKV);
      }
      if (this.rKW != null) {
        paramVarArgs.g(4, this.rKW);
      }
      if (this.hcS != null) {
        paramVarArgs.g(5, this.hcS);
      }
      if (this.rKX != null) {
        paramVarArgs.g(6, this.rKX);
      }
      if (this.rKY != null) {
        paramVarArgs.g(7, this.rKY);
      }
      if (this.rKZ != null) {
        paramVarArgs.g(8, this.rKZ);
      }
      paramVarArgs.fT(9, this.rLa);
      if (this.iwP != null) {
        paramVarArgs.g(10, this.iwP);
      }
      if (this.reS != null) {
        paramVarArgs.g(11, this.reS);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label945;
      }
    }
    label945:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rhB != null) {
        paramInt = i + f.a.a.a.fS(2, this.rhB.boi());
      }
      i = paramInt;
      if (this.rKV != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rKV);
      }
      paramInt = i;
      if (this.rKW != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rKW);
      }
      i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hcS);
      }
      paramInt = i;
      if (this.rKX != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rKX);
      }
      i = paramInt;
      if (this.rKY != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rKY);
      }
      paramInt = i;
      if (this.rKZ != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rKZ);
      }
      i = paramInt + f.a.a.a.fQ(9, this.rLa);
      paramInt = i;
      if (this.iwP != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.iwP);
      }
      i = paramInt;
      if (this.reS != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.reS);
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
        if (this.rhB != null) {
          break;
        }
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        aie localaie = (aie)paramVarArgs[1];
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
            localaie.shX = ((fk)localObject1);
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
            localaie.rhB = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localaie.rKV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaie.rKW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaie.hcS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localaie.rKX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localaie.rKY = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localaie.rKZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 9: 
          localaie.rLa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localaie.iwP = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localaie.reS = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aie.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */