package com.tencent.mm.plugin.backup.h;

import f.a.a.b;
import java.util.LinkedList;

public final class af
  extends com.tencent.mm.bk.a
{
  public String hbD;
  public LinkedList<Long> hda = new LinkedList();
  public LinkedList<String> hdb = new LinkedList();
  public LinkedList<String> hdc = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbD == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      paramVarArgs.d(1, 3, this.hda);
      paramVarArgs.d(2, 1, this.hdb);
      paramVarArgs.d(3, 1, this.hdc);
      if (this.hbD != null) {
        paramVarArgs.g(4, this.hbD);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.c(1, 3, this.hda) + 0 + f.a.a.a.c(2, 1, this.hdb) + f.a.a.a.c(3, 1, this.hdc);
      paramInt = i;
    } while (this.hbD == null);
    return i + f.a.a.b.b.a.h(4, this.hbD);
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.hda.clear();
      this.hdb.clear();
      this.hdc.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.hbD == null) {
        throw new b("Not all required fields were included: BakChatName");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      af localaf = (af)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localaf.hda.add(Long.valueOf(locala.vHC.rZ()));
        return 0;
      case 2: 
        localaf.hdb.add(locala.vHC.readString());
        return 0;
      case 3: 
        localaf.hdc.add(locala.vHC.readString());
        return 0;
      }
      localaf.hbD = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/h/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */