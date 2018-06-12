package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aim
  extends bhd
{
  public String bPS;
  public String rLl;
  public String rLm;
  public int rLn;
  public int rnc;
  
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
      if (this.rLl != null) {
        paramVarArgs.g(3, this.rLl);
      }
      if (this.rLm != null) {
        paramVarArgs.g(4, this.rLm);
      }
      paramVarArgs.fT(5, this.rnc);
      paramVarArgs.fT(6, this.rLn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label512;
      }
    }
    label512:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bPS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bPS);
      }
      i = paramInt;
      if (this.rLl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rLl);
      }
      paramInt = i;
      if (this.rLm != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rLm);
      }
      return paramInt + f.a.a.a.fQ(5, this.rnc) + f.a.a.a.fQ(6, this.rLn);
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
        aim localaim = (aim)paramVarArgs[1];
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
            localaim.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaim.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaim.rLl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localaim.rLm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localaim.rnc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localaim.rLn = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/aim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */