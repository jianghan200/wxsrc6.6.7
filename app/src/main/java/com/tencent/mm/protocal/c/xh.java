package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class xh
  extends bhd
{
  public String lPm;
  public String rDg;
  public String rDh;
  public String rDi;
  public String rhu;
  public String rwj;
  
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
      if (this.rDg != null) {
        paramVarArgs.g(2, this.rDg);
      }
      if (this.rhu != null) {
        paramVarArgs.g(3, this.rhu);
      }
      if (this.lPm != null) {
        paramVarArgs.g(4, this.lPm);
      }
      if (this.rDh != null) {
        paramVarArgs.g(5, this.rDh);
      }
      if (this.rDi != null) {
        paramVarArgs.g(6, this.rDi);
      }
      if (this.rwj != null) {
        paramVarArgs.g(7, this.rwj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label607;
      }
    }
    label607:
    for (int i = f.a.a.a.fS(1, this.shX.boi()) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rDg != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rDg);
      }
      i = paramInt;
      if (this.rhu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rhu);
      }
      paramInt = i;
      if (this.lPm != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.lPm);
      }
      i = paramInt;
      if (this.rDh != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rDh);
      }
      paramInt = i;
      if (this.rDi != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rDi);
      }
      i = paramInt;
      if (this.rwj != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rwj);
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
        xh localxh = (xh)paramVarArgs[1];
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
            localxh.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          localxh.rDg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localxh.rhu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localxh.lPm = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localxh.rDh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localxh.rDi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localxh.rwj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/xh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */