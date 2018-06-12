package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class aja
  extends bhd
{
  public String bPS;
  public boolean rLK;
  public LinkedList<String> rLL = new LinkedList();
  public int source;
  
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
      paramVarArgs.av(3, this.rLK);
      paramVarArgs.d(4, 1, this.rLL);
      paramVarArgs.fT(5, this.source);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label446;
      }
    }
    label446:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.bPS != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.bPS);
      }
      return i + (f.a.a.b.b.a.ec(3) + 1) + f.a.a.a.c(4, 1, this.rLL) + f.a.a.a.fQ(5, this.source);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rLL.clear();
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
        aja localaja = (aja)paramVarArgs[1];
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
            localaja.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localaja.bPS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localaja.rLK = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 4: 
          localaja.rLL.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        }
        localaja.source = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/aja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */