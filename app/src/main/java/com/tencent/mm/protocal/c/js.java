package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class js
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String lPl;
  public jv rlg;
  public jw rlh;
  public jp rli;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jOS == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.lPl == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (this.rlg == null) {
        throw new b("Not all required fields were included: DetailInfo");
      }
      if (this.rli == null) {
        throw new b("Not all required fields were included: ActionInfo");
      }
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(2, this.jOS);
      }
      if (this.lPl != null) {
        paramVarArgs.g(3, this.lPl);
      }
      if (this.rlg != null)
      {
        paramVarArgs.fV(4, this.rlg.boi());
        this.rlg.a(paramVarArgs);
      }
      if (this.rlh != null)
      {
        paramVarArgs.fV(5, this.rlh.boi());
        this.rlh.a(paramVarArgs);
      }
      if (this.rli != null)
      {
        paramVarArgs.fV(6, this.rli.boi());
        this.rli.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label904;
      }
    }
    label904:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jOS);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lPl);
      }
      paramInt = i;
      if (this.rlg != null) {
        paramInt = i + f.a.a.a.fS(4, this.rlg.boi());
      }
      i = paramInt;
      if (this.rlh != null) {
        i = paramInt + f.a.a.a.fS(5, this.rlh.boi());
      }
      paramInt = i;
      if (this.rli != null) {
        paramInt = i + f.a.a.a.fS(6, this.rli.boi());
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
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jOS == null) {
          throw new b("Not all required fields were included: Desc");
        }
        if (this.lPl == null) {
          throw new b("Not all required fields were included: ThumbUrl");
        }
        if (this.rlg == null) {
          throw new b("Not all required fields were included: DetailInfo");
        }
        if (this.rli != null) {
          break;
        }
        throw new b("Not all required fields were included: ActionInfo");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        js localjs = (js)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localjs.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localjs.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localjs.lPl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new jv();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((jv)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localjs.rlg = ((jv)localObject1);
            paramInt += 1;
          }
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new jw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((jw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localjs.rlh = ((jw)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new jp();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((jp)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
          localjs.rli = ((jp)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/js.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */