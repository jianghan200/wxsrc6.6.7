package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class nb
  extends bhd
{
  public String knE;
  public String lMV;
  public String rrg;
  public String rrh;
  
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
      if (this.rrg != null) {
        paramVarArgs.g(2, this.rrg);
      }
      if (this.rrh != null) {
        paramVarArgs.g(3, this.rrh);
      }
      if (this.knE != null) {
        paramVarArgs.g(4, this.knE);
      }
      if (this.lMV != null) {
        paramVarArgs.g(5, this.lMV);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label493;
      }
    }
    label493:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rrg != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rrg);
      }
      i = paramInt;
      if (this.rrh != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rrh);
      }
      paramInt = i;
      if (this.knE != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.knE);
      }
      i = paramInt;
      if (this.lMV != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.lMV);
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
        nb localnb = (nb)paramVarArgs[1];
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
            localnb.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localnb.rrg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localnb.rrh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localnb.knE = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localnb.lMV = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/nb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */