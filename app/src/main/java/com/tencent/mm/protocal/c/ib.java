package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ib
  extends bhd
{
  public int otY;
  public String rem;
  public LinkedList<String> rjg = new LinkedList();
  public String rjh;
  public double rji;
  public double rjj;
  
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
      if (this.rem != null) {
        paramVarArgs.g(2, this.rem);
      }
      paramVarArgs.d(3, 1, this.rjg);
      paramVarArgs.fT(4, this.otY);
      if (this.rjh != null) {
        paramVarArgs.g(5, this.rjh);
      }
      paramVarArgs.c(6, this.rji);
      paramVarArgs.c(7, this.rjj);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label547;
      }
    }
    label547:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rem != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rem);
      }
      i = i + f.a.a.a.c(3, 1, this.rjg) + f.a.a.a.fQ(4, this.otY);
      paramInt = i;
      if (this.rjh != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rjh);
      }
      return paramInt + (f.a.a.b.b.a.ec(6) + 8) + (f.a.a.b.b.a.ec(7) + 8);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rjg.clear();
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
        ib localib = (ib)paramVarArgs[1];
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
            localib.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localib.rem = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localib.rjg.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 4: 
          localib.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localib.rjh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localib.rji = ((f.a.a.a.a)localObject1).vHC.readDouble();
          return 0;
        }
        localib.rjj = ((f.a.a.a.a)localObject1).vHC.readDouble();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/ib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */