package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bzh
  extends bhd
{
  public int rth;
  public long see;
  public int sef;
  public String svt;
  public com.tencent.mm.bk.b svu;
  public com.tencent.mm.bk.b svv;
  public String svw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.svt == null) {
        throw new f.a.a.b("Not all required fields were included: ToBizUserName");
      }
      if (this.svv == null) {
        throw new f.a.a.b("Not all required fields were included: CapInfo");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sef);
      if (this.svt != null) {
        paramVarArgs.g(3, this.svt);
      }
      paramVarArgs.fT(4, this.rth);
      if (this.svu != null) {
        paramVarArgs.b(5, this.svu);
      }
      if (this.svv != null) {
        paramVarArgs.b(6, this.svv);
      }
      paramVarArgs.T(7, this.see);
      if (this.svw != null) {
        paramVarArgs.g(8, this.svw);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label676;
      }
    }
    label676:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sef);
      paramInt = i;
      if (this.svt != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.svt);
      }
      i = paramInt + f.a.a.a.fQ(4, this.rth);
      paramInt = i;
      if (this.svu != null) {
        paramInt = i + f.a.a.a.a(5, this.svu);
      }
      i = paramInt;
      if (this.svv != null) {
        i = paramInt + f.a.a.a.a(6, this.svv);
      }
      i += f.a.a.a.S(7, this.see);
      paramInt = i;
      if (this.svw != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.svw);
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
        if (this.svt == null) {
          throw new f.a.a.b("Not all required fields were included: ToBizUserName");
        }
        if (this.svv != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: CapInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bzh localbzh = (bzh)paramVarArgs[1];
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
            localbzh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbzh.sef = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbzh.svt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbzh.rth = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbzh.svu = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 6: 
          localbzh.svv = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 7: 
          localbzh.see = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        }
        localbzh.svw = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */