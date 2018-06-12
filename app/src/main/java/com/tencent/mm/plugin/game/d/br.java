package com.tencent.mm.plugin.game.d;

import f.a.a.b;
import java.util.LinkedList;

public final class br
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public LinkedList<bs> jSm = new LinkedList();
  public String jSn;
  public String jSo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      paramVarArgs.d(2, 8, this.jSm);
      if (this.jSn != null) {
        paramVarArgs.g(3, this.jSn);
      }
      if (this.jSo != null) {
        paramVarArgs.g(4, this.jSo);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label458;
      }
    }
    label458:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.c(2, 8, this.jSm);
      paramInt = i;
      if (this.jSn != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jSn);
      }
      i = paramInt;
      if (this.jSo != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.jSo);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jSm.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.bHD != null) {
          break;
        }
        throw new b("Not all required fields were included: Title");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        br localbr = (br)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbr.bHD = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bs();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bs)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbr.jSm.add(localObject1);
            paramInt += 1;
          }
        case 3: 
          localbr.jSn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbr.jSo = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/d/br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */