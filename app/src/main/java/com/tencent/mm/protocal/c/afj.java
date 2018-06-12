package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afj
  extends bhd
{
  public int rJr;
  public int rci;
  public bhz rcj;
  public bhz rck;
  public long rcq;
  public int rdV;
  public int rdW;
  public int rdX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rci);
      if (this.rcj != null)
      {
        paramVarArgs.fV(3, this.rcj.boi());
        this.rcj.a(paramVarArgs);
      }
      if (this.rck != null)
      {
        paramVarArgs.fV(4, this.rck.boi());
        this.rck.a(paramVarArgs);
      }
      paramVarArgs.fT(5, this.rdV);
      paramVarArgs.fT(6, this.rdW);
      paramVarArgs.fT(7, this.rdX);
      paramVarArgs.fT(8, this.rJr);
      paramVarArgs.T(9, this.rcq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label865;
      }
    }
    label865:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rci);
      paramInt = i;
      if (this.rcj != null) {
        paramInt = i + f.a.a.a.fS(3, this.rcj.boi());
      }
      i = paramInt;
      if (this.rck != null) {
        i = paramInt + f.a.a.a.fS(4, this.rck.boi());
      }
      return i + f.a.a.a.fQ(5, this.rdV) + f.a.a.a.fQ(6, this.rdW) + f.a.a.a.fQ(7, this.rdX) + f.a.a.a.fQ(8, this.rJr) + f.a.a.a.S(9, this.rcq);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcj == null) {
          throw new b("Not all required fields were included: FromUserName");
        }
        if (this.rck != null) {
          break;
        }
        throw new b("Not all required fields were included: ToUserName");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        afj localafj = (afj)paramVarArgs[1];
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
            localafj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafj.rci = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localafj.rcj = ((bhz)localObject1);
            paramInt += 1;
          }
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localafj.rck = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localafj.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localafj.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localafj.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localafj.rJr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localafj.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */