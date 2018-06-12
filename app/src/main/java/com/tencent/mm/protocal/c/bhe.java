package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bhe
  extends bhd
{
  public String lMV;
  public String muA;
  public String muB;
  public int mun;
  public String ref;
  public int shY;
  public String shZ;
  public int sia;
  public int sib;
  
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
      if (this.muA != null) {
        paramVarArgs.g(2, this.muA);
      }
      if (this.muB != null) {
        paramVarArgs.g(3, this.muB);
      }
      if (this.lMV != null) {
        paramVarArgs.g(4, this.lMV);
      }
      paramVarArgs.fT(5, this.mun);
      paramVarArgs.fT(6, this.shY);
      if (this.shZ != null) {
        paramVarArgs.g(7, this.shZ);
      }
      paramVarArgs.fT(8, this.sia);
      paramVarArgs.fT(9, this.sib);
      if (this.ref != null) {
        paramVarArgs.g(10, this.ref);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label708;
      }
    }
    label708:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.muA != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.muA);
      }
      i = paramInt;
      if (this.muB != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.muB);
      }
      paramInt = i;
      if (this.lMV != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.lMV);
      }
      i = paramInt + f.a.a.a.fQ(5, this.mun) + f.a.a.a.fQ(6, this.shY);
      paramInt = i;
      if (this.shZ != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.shZ);
      }
      i = paramInt + f.a.a.a.fQ(8, this.sia) + f.a.a.a.fQ(9, this.sib);
      paramInt = i;
      if (this.ref != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.ref);
      }
      return paramInt;
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
        bhe localbhe = (bhe)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
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
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbhe.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbhe.muA = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbhe.muB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbhe.lMV = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbhe.mun = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbhe.shY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbhe.shZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbhe.sia = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbhe.sib = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localbhe.ref = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bhe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */