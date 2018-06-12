package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class bw
  extends com.tencent.mm.bk.a
{
  public String jOU;
  public String jPc;
  public cf jPq;
  public String jSu;
  public String jSv;
  public String jSw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPc != null) {
        paramVarArgs.g(1, this.jPc);
      }
      if (this.jSu != null) {
        paramVarArgs.g(2, this.jSu);
      }
      if (this.jSv != null) {
        paramVarArgs.g(3, this.jSv);
      }
      if (this.jSw != null) {
        paramVarArgs.g(4, this.jSw);
      }
      if (this.jPq != null)
      {
        paramVarArgs.fV(5, this.jPq.boi());
        this.jPq.a(paramVarArgs);
      }
      if (this.jOU != null) {
        paramVarArgs.g(6, this.jOU);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPc == null) {
        break label548;
      }
    }
    label548:
    for (int i = f.a.a.b.b.a.h(1, this.jPc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jSu != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jSu);
      }
      i = paramInt;
      if (this.jSv != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSv);
      }
      paramInt = i;
      if (this.jSw != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSw);
      }
      i = paramInt;
      if (this.jPq != null) {
        i = paramInt + f.a.a.a.fS(5, this.jPq.boi());
      }
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jOU);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bw localbw = (bw)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbw.jPc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbw.jSu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localbw.jSv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbw.jSw = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbw.jPq = ((cf)localObject1);
            paramInt += 1;
          }
        }
        localbw.jOU = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */