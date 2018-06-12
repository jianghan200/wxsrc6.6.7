package com.tencent.mm.plugin.game.d;

import java.util.LinkedList;

public final class cr
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jOT;
  public e jOV;
  public String jQb;
  public String jQh;
  public String jRi;
  public LinkedList<v> jTa = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      if (this.jOT != null) {
        paramVarArgs.g(3, this.jOT);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.jRi != null) {
        paramVarArgs.g(5, this.jRi);
      }
      if (this.jOV != null)
      {
        paramVarArgs.fV(6, this.jOV.boi());
        this.jOV.a(paramVarArgs);
      }
      paramVarArgs.d(7, 8, this.jTa);
      if (this.jQh != null) {
        paramVarArgs.g(8, this.jQh);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label740;
      }
    }
    label740:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt;
      if (this.jOT != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOT);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.jRi != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jRi);
      }
      paramInt = i;
      if (this.jOV != null) {
        paramInt = i + f.a.a.a.fS(6, this.jOV.boi());
      }
      i = paramInt + f.a.a.a.c(7, 8, this.jTa);
      paramInt = i;
      if (this.jQh != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.jQh);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jTa.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        cr localcr = (cr)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localcr.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localcr.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localcr.jOT = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localcr.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localcr.jRi = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new e();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcr.jOV = ((e)localObject1);
            paramInt += 1;
          }
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new v();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((v)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localcr.jTa.add(localObject1);
            paramInt += 1;
          }
        }
        localcr.jQh = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */