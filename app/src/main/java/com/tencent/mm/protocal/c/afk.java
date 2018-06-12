package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class afk
  extends bhp
{
  public int rci;
  public bhz rcj;
  public bhz rck;
  public long rcq;
  public int rdV;
  public int rdW;
  public int rdX;
  public bhy rtW;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.rcj == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.rck == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      if (this.rtW == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
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
      if (this.rtW != null)
      {
        paramVarArgs.fV(8, this.rtW.boi());
        this.rtW.a(paramVarArgs);
      }
      paramVarArgs.T(9, this.rcq);
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1047;
      }
    }
    label1047:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
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
      i = i + f.a.a.a.fQ(5, this.rdV) + f.a.a.a.fQ(6, this.rdW) + f.a.a.a.fQ(7, this.rdX);
      paramInt = i;
      if (this.rtW != null) {
        paramInt = i + f.a.a.a.fS(8, this.rtW.boi());
      }
      return paramInt + f.a.a.a.S(9, this.rcq);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.rcj == null) {
          throw new b("Not all required fields were included: FromUserName");
        }
        if (this.rck == null) {
          throw new b("Not all required fields were included: ToUserName");
        }
        if (this.rtW != null) {
          break;
        }
        throw new b("Not all required fields were included: Data");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        afk localafk = (afk)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafk.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localafk.rci = ((f.a.a.a.a)localObject1).vHC.rY();
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafk.rcj = ((bhz)localObject1);
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
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafk.rck = ((bhz)localObject1);
            paramInt += 1;
          }
        case 5: 
          localafk.rdV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localafk.rdW = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localafk.rdX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localafk.rtW = ((bhy)localObject1);
            paramInt += 1;
          }
        }
        localafk.rcq = ((f.a.a.a.a)localObject1).vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/afk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */