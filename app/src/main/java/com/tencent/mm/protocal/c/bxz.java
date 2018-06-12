package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bxz
  extends bhd
{
  public String bLe;
  public String bPS;
  public String lMV;
  public String pqM;
  public String reM;
  public LinkedList<Integer> skh = new LinkedList();
  public String ski;
  public String skk;
  
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
      if (this.bPS != null) {
        paramVarArgs.g(2, this.bPS);
      }
      paramVarArgs.d(3, 2, this.skh);
      if (this.ski != null) {
        paramVarArgs.g(4, this.ski);
      }
      if (this.reM != null) {
        paramVarArgs.g(5, this.reM);
      }
      if (this.bLe != null) {
        paramVarArgs.g(6, this.bLe);
      }
      if (this.pqM != null) {
        paramVarArgs.g(7, this.pqM);
      }
      if (this.skk != null) {
        paramVarArgs.g(8, this.skk);
      }
      if (this.lMV != null) {
        paramVarArgs.g(9, this.lMV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label720;
      }
    }
    label720:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bPS);
      }
      i += f.a.a.a.c(3, 2, this.skh);
      paramInt = i;
      if (this.ski != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ski);
      }
      i = paramInt;
      if (this.reM != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.reM);
      }
      paramInt = i;
      if (this.bLe != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.bLe);
      }
      i = paramInt;
      if (this.pqM != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.pqM);
      }
      paramInt = i;
      if (this.skk != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.skk);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.lMV);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.skh.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        bxz localbxz = (bxz)paramVarArgs[1];
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
            localbxz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbxz.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbxz.skh.add(Integer.valueOf(((f.a.a.a.a)localObject1).vHC.rY()));
          return 0;
        case 4: 
          localbxz.ski = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbxz.reM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbxz.bLe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localbxz.pqM = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbxz.skk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbxz.lMV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */