package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class nz
  extends bhd
{
  public String rsb;
  public String rsc;
  public String rsd;
  public String rse;
  public String rsf;
  public long rsg;
  public String rsh;
  public String rsi;
  
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
      if (this.rsb != null) {
        paramVarArgs.g(2, this.rsb);
      }
      if (this.rsc != null) {
        paramVarArgs.g(3, this.rsc);
      }
      if (this.rsd != null) {
        paramVarArgs.g(4, this.rsd);
      }
      if (this.rse != null) {
        paramVarArgs.g(5, this.rse);
      }
      if (this.rsf != null) {
        paramVarArgs.g(6, this.rsf);
      }
      paramVarArgs.T(7, this.rsg);
      if (this.rsh != null) {
        paramVarArgs.g(8, this.rsh);
      }
      if (this.rsi != null) {
        paramVarArgs.g(9, this.rsi);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label705;
      }
    }
    label705:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rsb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rsb);
      }
      i = paramInt;
      if (this.rsc != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rsc);
      }
      paramInt = i;
      if (this.rsd != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rsd);
      }
      i = paramInt;
      if (this.rse != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rse);
      }
      paramInt = i;
      if (this.rsf != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rsf);
      }
      i = paramInt + f.a.a.a.S(7, this.rsg);
      paramInt = i;
      if (this.rsh != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.rsh);
      }
      i = paramInt;
      if (this.rsi != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rsi);
      }
      return i;
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
        nz localnz = (nz)paramVarArgs[1];
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
            localnz.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localnz.rsb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localnz.rsc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localnz.rsd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localnz.rse = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localnz.rsf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localnz.rsg = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 8: 
          localnz.rsh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localnz.rsi = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/nz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */