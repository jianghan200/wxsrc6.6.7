package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class apa
  extends bhp
{
  public com.tencent.mm.bk.b hbs;
  public String jSv;
  public aof rRd;
  public bio rRk;
  public String rbh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      if (this.rRd != null)
      {
        paramVarArgs.fV(2, this.rRd.boi());
        this.rRd.a(paramVarArgs);
      }
      if (this.hbs != null) {
        paramVarArgs.b(3, this.hbs);
      }
      if (this.rRk != null)
      {
        paramVarArgs.fV(4, this.rRk.boi());
        this.rRk.a(paramVarArgs);
      }
      if (this.jSv != null) {
        paramVarArgs.g(5, this.jSv);
      }
      if (this.rbh != null) {
        paramVarArgs.g(6, this.rbh);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label765;
      }
    }
    label765:
    for (int i = f.a.a.a.fS(1, this.six.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rRd != null) {
        paramInt = i + f.a.a.a.fS(2, this.rRd.boi());
      }
      i = paramInt;
      if (this.hbs != null) {
        i = paramInt + f.a.a.a.a(3, this.hbs);
      }
      paramInt = i;
      if (this.rRk != null) {
        paramInt = i + f.a.a.a.fS(4, this.rRk.boi());
      }
      i = paramInt;
      if (this.jSv != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jSv);
      }
      paramInt = i;
      if (this.rbh != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rbh);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        apa localapa = (apa)paramVarArgs[1];
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
            localapa.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new aof();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aof)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localapa.rRd = ((aof)localObject1);
            paramInt += 1;
          }
        case 3: 
          localapa.hbs = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bio();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bio)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localapa.rRk = ((bio)localObject1);
            paramInt += 1;
          }
        case 5: 
          localapa.jSv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localapa.rbh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/apa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */