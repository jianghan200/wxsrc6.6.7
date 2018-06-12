package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class w
  extends bhd
{
  public int limit;
  public int offset;
  public String qYQ;
  public int qYR;
  public int qYS;
  public String qYT;
  public int type;
  
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
      paramVarArgs.fT(2, this.limit);
      paramVarArgs.fT(3, this.offset);
      paramVarArgs.fT(4, this.type);
      if (this.qYQ != null) {
        paramVarArgs.g(5, this.qYQ);
      }
      paramVarArgs.fT(6, this.qYR);
      paramVarArgs.fT(7, this.qYS);
      if (this.qYT != null) {
        paramVarArgs.g(8, this.qYT);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label578;
      }
    }
    label578:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.limit) + f.a.a.a.fQ(3, this.offset) + f.a.a.a.fQ(4, this.type);
      paramInt = i;
      if (this.qYQ != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.qYQ);
      }
      i = paramInt + f.a.a.a.fQ(6, this.qYR) + f.a.a.a.fQ(7, this.qYS);
      paramInt = i;
      if (this.qYT != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.qYT);
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
        w localw = (w)paramVarArgs[1];
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
            localw.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localw.limit = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localw.offset = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          localw.type = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localw.qYQ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localw.qYR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localw.qYS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localw.qYT = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */